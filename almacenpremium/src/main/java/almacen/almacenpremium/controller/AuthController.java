package almacen.almacenpremium.controller;

public class AuthController {
  // @Autowired
    // AuthenticationManager authenticationManager;

    // @Autowired
    // UserRepository userRepository;

    // @Autowired
    // RoleRepository roleRepository;

    // @Autowired
    // PasswordEncoder encoder;

    // @Autowired
    // JwtUtils jwtUtils;
    
    // @Autowired
    // AuthenticationManager authenticationManager;

    // @Autowired
    // UserRepository userRepository;

    // @Autowired
    // RoleRepository roleRepository;

    // @Autowired
    // PasswordEncoder encoder;

    // @Autowired
    // JwtUtils jwtUtils;

    // @PostMapping("/login")
    // public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    //     Authentication authentication = authenticationManager.authenticate(
    //             new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), 
    //                                                     loginRequest.getPassword()
    //                                                     ));

    //     SecurityContextHolder.getContext().setAuthentication(authentication);
    //     String jwt = jwtUtils.generateJwtToken(authentication);

    //     UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
    //     List<String> roles = userDetails.getAuthorities().stream()
    //             .map(item -> item.getAuthority())
    //             .collect(Collectors.toList());

    //     return ResponseEntity.ok(new JwtResponse(jwt,
    //             userDetails.getId(),
    //             userDetails.getUsername(),
    //             userDetails.getEmail(),
    //             roles));
    // }

    // @PostMapping("/registrar")
    // public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    //     if (userRepository.existsByUsername(signUpRequest.getUsername())) {
    //         return ResponseEntity
    //                 .badRequest()
    //                 .body(new MessageResponse("Error: Username ya existe!"));
    //     }

    //     if (userRepository.existsByEmail(signUpRequest.getEmail())) {
    //         return ResponseEntity
    //                 .badRequest()
    //                 .body(new MessageResponse("Error: Email ya existe!"));
    //     }
        
    //     // Create new user's account
    //     User user = new User(signUpRequest.getUsername(),
    //             signUpRequest.getEmail(),
    //             encoder.encode(signUpRequest.getPassword()));

    //     Set<String> strRoles = signUpRequest.getRole();
    //     Set<Role> roles = new HashSet<>();

    //     if (strRoles == null) {
    //         Role userRole = roleRepository.findByName(ERole.ROLE_USER)
    //                 .orElseThrow(() -> new RuntimeException("Error: Rol no existe."));
    //         roles.add(userRole);
    //     } else {
    //         strRoles.forEach(role -> {
    //             switch (role) {
    //                 case "admin":
    //                     Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
    //                             .orElseThrow(() -> new RuntimeException("Error: Role no encontrado."));
    //                     roles.add(adminRole);

    //                     break;
    //                 default:
    //                     Role userRole = roleRepository.findByName(ERole.ROLE_USER)
    //                             .orElseThrow(() -> new RuntimeException("Error: Role no encontrado."));
    //                     roles.add(userRole);
    //             }
    //         });
    //     }

    //     user.setRoles(roles);
    //     userRepository.save(user);

    //     return ResponseEntity.ok(new MessageResponse("Usuario registrado con éxito!"));
    // }
}